# SOLID principles

### S – Single Responsibility Principle
กล่าวถึง Class หนึ่งๆนั้นควรจะมีแค่หน้าที่ ความรับผิดชอบเดียวเท่านั้น

### O – Open Closed Principle
กล่าวถึง ระบบของ Software นั้นควรง่ายและเป็นระบบเปิดต่อการต่อยอดโดยที่แก้ไขระบบหลักให้น้อยที่สุด

### L – Liskov substitution Principle
กล่าวถึง Object ของ Class ที่ระบบได้เรียกใช้นั้นควรจะสามารถเรียกใช้ Class ลูกๆได้โดยที่ไม่ต้องแก้ไขระบบเลย (ข้อนี้อาจจะเข้าใจยากนิดนึงนะครับ อาจจะต้องลองดูตัวอย่าง)

### I – Interface segregation Principle
กล่าวถึงการแบ่งย่อย Interface ให้เป็นสัดสวนตามหน้าที่ของมัน ดีกว่ามี Interface เดียวที่มีหลายๆ Methods

### D – Dependency Inversion Principle
กล่างถึงการที่ Class ต่างๆติดต่อกับอีก Class อื่นๆนั้น ควรจะติดต่อกันผ่าน Interface มากกว่า Object ของ Class นั้นๆตรงๆ


> REF1: https://anurocha.com/2017/07/29/solid-oop/
> REF2: https://en.wikipedia.org/wiki/SOLID_(object-oriented_design)